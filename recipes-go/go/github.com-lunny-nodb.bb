DESCRIPTION = "github.com/lunny/nodb"

GO_IMPORT = "github.com/lunny/nodb"

inherit go

SRC_URI = "git://github.com/lunny/nodb;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "fc1ef06ad4af0da31cdb87e3fa5ec084c67e6597"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=21a1f824fde7349d4bfd361e2e0bff4d"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-siddontang-go-snappy \
    github.com-syndtr-goleveldb \
    github.com-lunny-log \
    github.com-peterh-liner \
    github.com-siddontang-ledisdb \
    github.com-burntsushi-toml \
    github.com-ugorji-go \
"
do_compile_ptest_base() {
	:
}

RDEPENDS_${PN}-dev += "\
                       bash \
                      "
