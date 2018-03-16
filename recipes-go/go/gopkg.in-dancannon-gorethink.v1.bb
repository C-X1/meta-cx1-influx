DESCRIPTION = "gopkg.in/dancannon/gorethink.v1"

GO_IMPORT = "gopkg.in/dancannon/gorethink.v1"

inherit go

SRC_URI = "git://gopkg.in/dancannon/gorethink.v1;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "edc7a6a68e2d8015f5ffe1b2560eed989f8a45be" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=bb2a2f2b7222607afeac4f5a31aca701"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
   github.com-cenkalti-backoff \
   github.com-hailocab-go-hostpool \
   gopkg.in-fatih-pool.v2 \
   gopkg.in-check.v1 \
   github.com-sirupsen-logrus \
   github.com-golang-protobuf \
"
