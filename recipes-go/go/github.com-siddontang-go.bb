DESCRIPTION = "github.com/siddontang/go"

GO_IMPORT = "github.com/siddontang/go"

inherit go

SRC_URI = "git://github.com/siddontang/go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6463c3972685bfea94e6dc1f6817bee41b20269f" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=10f698e62bec44763536541194eca159"

DEPENDS += "github.com-gorilla-websocket"

FILES_${PN} += "${GOBIN_FINAL}/*"
