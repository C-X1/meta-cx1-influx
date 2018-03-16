DESCRIPTION = "github.com/prometheus/client_model"

GO_IMPORT = "github.com/prometheus/client_model"

inherit go

SRC_URI = "git://github.com/prometheus/client_model;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6f3806018612930941127f2a7c6c453ba2c527d2" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "github.com-golang-protobuf"
FILES_${PN} += "${GOBIN_FINAL}/*"
