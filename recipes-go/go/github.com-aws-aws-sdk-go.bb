DESCRIPTION = "github.com/aws/aws-sdk-go"

GO_IMPORT = "github.com/aws/aws-sdk-go"

inherit go

SRC_URI = "git://github.com/aws/aws-sdk-go;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "7524cb911daddd6e5c9195def8e59ae892bef8d9" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "github.com-stretchr-testify"

FILES_${PN} += "${GOBIN_FINAL}/*"
