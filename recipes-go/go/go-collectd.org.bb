DESCRIPTION = "collectd.org"

GO_IMPORT = "collectd.org"

inherit go
CGO_ENABLED = "0"
SRC_URI = "git://github.com/collectd/go-collectd;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "606bd390f38f050824c77208d6715ed59e3692ac"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1066c3ee0bb6b5d3474b33649d4b0ede"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-golang-protobuf \
    grpc-go \
    collectd \
"

do_compile_ptest_base() {
	:
}
SECURITY_CFLAGS = ""
