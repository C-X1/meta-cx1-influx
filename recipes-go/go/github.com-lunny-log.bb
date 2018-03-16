DESCRIPTION = "github.com/lunny/log"

GO_IMPORT = "github.com/lunny/log"

inherit go

SRC_URI = "git://github.com/lunny/log;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "7887c61bf0de75586961948b286be6f7d05d9f58" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a45b3c31ba2fa18ad1834084a30c4918"
DEPENDS += "github.com-mattn-go-sqlite3"
FILES_${PN} += "${GOBIN_FINAL}/*"
