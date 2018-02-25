DESCRIPTION = "github.com/matttproud/golang_protobuf_extensions"

GO_IMPORT = "github.com/matttproud/golang_protobuf_extensions"

DEPENDS += "github.com-golang-protobuf"

inherit go

SRC_URI = "git://github.com/matttproud/golang_protobuf_extensions;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "c12348ce28de40eed0136aa2b644d0ee0650e56c" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

FILES_${PN} += "${GOBIN_FINAL}/*"
