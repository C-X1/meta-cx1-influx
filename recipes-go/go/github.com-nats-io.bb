DESCRIPTION = "github.com/nats-io/gnatsd"

GO_IMPORT = "github.com/nats-io"

PROVIDES += "\
  github.com-nats-io-gnatsd \
  github.com-nats-io-go-nats \
"

inherit go

SRC_URI = "git://github.com/nats-io/gnatsd;protocol=https;name=gnatsd;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/gnatsd \
           git://github.com/nats-io/go-nats;protocol=https;name=go-nats;destsuffix=${PN}-${PV}/src/${GO_IMPORT}/go-nats \
          "
# v1.0.4
SRCREV_gnatsd = "12a5ced612f30aa511906c0de12a124233752f70"
# v1.4.0
SRCREV_go-nats = "d66cb54e6b7bdd93f0b28afc8450d84c780dfb68"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/gnatsd/LICENSE;md5=984093cd25e1d0803a80e3ab3bef4f56 \
                    file://src/${GO_IMPORT}/go-nats/LICENSE;md5=984093cd25e1d0803a80e3ab3bef4f56 \
"

DEPENDS += "\
    github.com-nats-io-nuid \
    github.com-golang-protobuf \
"

GO_INSTALL = "\
    ${GO_IMPORT}/gnatsd \
    ${GO_IMPORT}/go-nats \
"

RDEPENDS_${PN}-dev += "bash"
