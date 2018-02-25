DESCRIPTION = "github.com/siddontang/goredis"

GO_IMPORT = "github.com/siddontang/goredis"

inherit go

SRC_URI = "git://github.com/siddontang/goredis;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "760763f78400635ed7b9b115511b8ed06035e908" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=35ed17c8fff4fa0fb7f4116a60960b70"

DEPENDS += "github.com-alicebob-miniredis"

FILES_${PN} += "${GOBIN_FINAL}/*"
