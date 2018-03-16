DESCRIPTION = "github.com/Sirupsen/logrus"

GO_IMPORT = "github.com/Sirupsen/logrus"

inherit go

SRC_URI = "git://github.com/Sirupsen/logrus;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "10f801ebc38b33738c9d17d50860f484a0988ff5"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0"
DEPENDS += "github.com-stretchr-testify"

GO_INSTALL = "\
    ${GO_IMPORT} \
    ${GO_IMPORT}/hooks/... \
    "

FILES_${PN} += "${GOBIN_FINAL}/*"
