DESCRIPTION = "Go support for Google's protocol buffers"
SECTION = "net"
HOMEPAGE = "https://github.com/golang/protobuf"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=14db3a56c3796a940ba32948a15f97d0"

DEPENDS = "golang.org-x-net golang-x-sync"

GO_IMPORT = "github.com/golang/protobuf"

SRC_URI = "\
	git://github.com/golang/protobuf.git;protocol=https;name=protobuf;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
	"

SRCREV_protobuf = "ae59567b9aab61b50b2590679a62c3c044030b61"

inherit go

do_install_append_class-target() {
	find "${D}${GOROOT_FINAL}" \( -name \*.sh -o -name \*.bash \) -delete
}
