DESCRIPTION = "github.com/shirou/gopsutil"

GO_IMPORT = "github.com/shirou/gopsutil"

inherit go

SRC_URI = "git://github.com/shirou/gopsutil;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "70693b6a3da51a8a686d31f1b346077bbc066062" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=ed7522382cec5b7a6d6ebb8e30eed40e"

DEPENDS += "github.com-stretchr-testify"

FILES_${PN} += "${GOBIN_FINAL}/*"
