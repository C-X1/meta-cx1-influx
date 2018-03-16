DESCRIPTION = "github.com/gogo/protobuf"

GO_IMPORT = "github.com/gogo/protobuf"

inherit go

SRC_URI = "git://github.com/gogo/protobuf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
# v1.1.0
SRCREV = "1adfc126b41513cc696b209667c8656ea7aac67c"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f76ab0572aa28f537b1508f2f2bc155e"

FILES_${PN} += "${GOBIN_FINAL}/*"
