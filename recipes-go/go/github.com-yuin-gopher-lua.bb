DESCRIPTION = "github.com/yuin/gopher-lua"

GO_IMPORT = "github.com/yuin/gopher-lua"

inherit go

SRC_URI = "git://github.com/yuin/gopher-lua;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "66c871e454fcf10251c61bf8eff02d0978cae75a" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5ea59bf62229a35ae7b2c7208524163e"

DEPENDS += "golang.org-x-net"

FILES_${PN} += "${GOBIN_FINAL}/*"
