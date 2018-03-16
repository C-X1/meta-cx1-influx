DESCRIPTION = "gopkg.in/olivere/elastic.v5"

GO_IMPORT = "gopkg.in/olivere/elastic.v5"

inherit go

SRC_URI = "git://gopkg.in/olivere/elastic.v5;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "00cf81dff7fdb9e31f70e99bd909339789e71a8e" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=8483e0fff54ad383eb8e6d8860f6b19c"

DEPENDS += "golang.org-x-net golang-x-sync"
FILES_${PN} += "${GOBIN_FINAL}/*"
