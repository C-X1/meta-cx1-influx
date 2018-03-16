DESCRIPTION = "github.com/influxdata/influxdb"

GO_IMPORT = "github.com/influxdata/influxdb"

inherit go pythonnative

SRC_URI = "git://github.com/influxdata/influxdb;protocol=https;branch=master;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# v1.5.0
SRCREV = "6ac835404e7e64ea7299a6eebcce1ab1ef15fe3c"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ba8146ad9cc2a128209983265136e06a"

FILES_${PN} += "${GOBIN_FINAL}/*"

do_configure_append() {
	sed -i -e "s%/usr/bin/python2.7.*%/usr/bin/env python2.7%g" ${S}/src/${GO_IMPORT}/build.py
	go get github.com/sparrc/gdm
	(cd ${B}/src/${GO_IMPORT} && ${B}/bin/gdm vendor)
}

DEPENDS += "mercurial-native git-native"

RDEPENDS_${PN}-staticdev += "\
                             perl \
                             "
RDEPENDS_${PN}-dev += "\
                       bash \
                       python \
                       "
