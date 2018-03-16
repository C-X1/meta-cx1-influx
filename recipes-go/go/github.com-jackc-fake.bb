DESCRIPTION = "github.com/jackc/fake"

GO_IMPORT = "github.com/jackc/fake"

inherit go

SRC_URI = "git://github.com/jackc/fake;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "812a484cc733c387d8dcf11ce9b15d75e0ddb865"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=425fdb36aaaad54496c6e0831ea156d4"

do_compile_prepend() {
	rm -rf ${S}/src/${GO_IMPORT}/test
}
FILES_${PN} += "${GOBIN_FINAL}/*"
