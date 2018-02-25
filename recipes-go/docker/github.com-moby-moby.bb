DESCRIPTION = "github.com/docker/docker"

GO_IMPORT = "github.com/docker/docker"

inherit go

SRC_URI = "git://github.com/moby/moby;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b89aff1afa1f61993ab2ba18fd62d9375a195f5d" 
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=aadc30f9c14d876ded7bedc0afd2d3d7"

DEPENDS += "\
    github.com-cpuguy83-go-md2man \
"

PROVIDES +="github.com-docker-docker"

GO_INSTALL = "\
    ${GO_IMPORT}/api/... \
    "
FILES_${PN} += "${GOBIN_FINAL}/*"
RDEPENDS_${PN}-dev = "make"

