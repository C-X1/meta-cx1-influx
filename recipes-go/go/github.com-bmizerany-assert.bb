DESCRIPTION = "github.com/bmizerany/assert"

GO_IMPORT = "github.com/bmizerany/assert"

inherit go

SRC_URI = "git://github.com/bmizerany/assert;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT} \
           file://753feab7979a587c45cec3aedaa9bd0b3eb7f376.patch;patchdir=src/${GO_IMPORT} \
"
SRCREV = "b7ed37b82869576c289d7d97fb2bbd8b64a0cb28"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/README.md;md5=88b3780955892e8530ff537b6ddc517e"
DEPENDS += "github.com-kr-pretty"

FILES_${PN} += "${GOBIN_FINAL}/*"
