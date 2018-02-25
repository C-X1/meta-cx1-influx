DESCRIPTION = "github.com/jackc/pgx"

GO_IMPORT = "github.com/jackc/pgx"

inherit go

SRC_URI = "git://github.com/jackc/pgx;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b84338d7d62598f75859b2b146d830b22f1b9ec8" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b34e77cc03aa5b5b612b330ce5bd2c2a"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    gopkg.in-inconshreveable-log15.v2 \
    github.com-mattn-go-colorable \
    github.com-jackc-fake \
    github.com-shopspring-decimal \
"

do_compile_ptest_base() {
	:
}
