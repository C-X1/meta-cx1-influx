DESCRIPTION = "github.com/aerospike/aerospike-client-go"

GO_IMPORT = "github.com/aerospike/aerospike-client-go"

inherit go

SRC_URI = "git://github.com/aerospike/aerospike-client-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "95e1ad7791bdbca44707fedbb29be42024900d9c" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4ffbf8936902d1fffb5a954a5dde4eb5"

FILES_${PN} += "${GOBIN_FINAL}/*"

GO_INSTALL = "\
    ${GO_IMPORT} \
    ${GO_IMPORT}/internal/... \
    ${GO_IMPORT}/logger/... \
    ${GO_IMPORT}/pkg/... \
    ${GO_IMPORT}/tools/... \
    ${GO_IMPORT}/types/... \
    ${GO_IMPORT}/utils/... \
    "

DEPENDS += "\
            github.com-yuin-gopher-lua \
            github.com-onsi-ginkgo \
            github.com-onsi-gomega \
            "

RDEPENDS_${PN}-dev += "\
                       bash \
                      "
