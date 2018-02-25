DESCRIPTION = "github.com/siddontang/ledisdb"

GO_IMPORT = "github.com/siddontang/ledisdb"

inherit go

SRC_URI = "git://github.com/siddontang/ledisdb;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "5835ab9b2b80e1e3f7dd31b7526836c4a0cbf8b2" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=21a1f824fde7349d4bfd361e2e0bff4d"

FILES_${PN} += "${GOBIN_FINAL}/*"

#github.com/syndtr/goleveldb/leveldb

DEPENDS+="\
    github.com-siddontang-goredis \
    github.com-siddontang-go \
    github.com-glendc-gopher-json \
    github.com-siddontang-go \
    github.com-siddontang-rdb \
    github.com-syndtr-goleveldb \
    github.com-edsrzf-mmap-go \
    github.com-peterh-liner \
    github.com-burntsushi-toml \
    github.com-ugorji-go \  
"   

RDEPENDS_${PN}-dev += "\
                             bash \
                            "