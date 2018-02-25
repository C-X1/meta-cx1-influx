DESCRIPTION = "github.com/prometheus stuff"

GO_IMPORT = "github.com/prometheus"

inherit go

SRC_URI = "git://github.com/prometheus/client_golang;protocol=https;name=client_golang;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/client_golang \
           git://github.com/prometheus/common;protocol=https;name=common;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/common \
          "
# v0.8.0
SRCREV_client_golang = "c5b7fccd204277076155f10851dad72b76a49317"
SRCREV_common = "9e0844febd9e2856f839c9cb974fbd676d1755a8"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://src/${GO_IMPORT}/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    "

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
            github.com-julienschmidt-httprouter \
            github.com-beorn7-perks \
            github.com-matttproud-golang \
            github.com-prometheus-client-model \
            github.com-prometheus-procfs \
            github.com-sirupsen-logrus \
            "
do_compile_ptest_base() {
	:
}
