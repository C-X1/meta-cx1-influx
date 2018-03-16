DESCRIPTION = "github.com/nats-io/nats"

GO_IMPORT = "github.com/nats-io/nats"

inherit go

SRC_URI = "git://github.com/nats-io/nats;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "ea9585611a4ab58a205b9b125ebd74c389a6b898" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f0add7a94e4dd1aa93a5a58b7ddada08"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-nats-io-gnatsd \
    github.com-nats-io-go-nats \
"

do_compile_ptest_base() {
	:
}

RDEPENDS_${PN}-dev += "\
                       bash \
                      "
