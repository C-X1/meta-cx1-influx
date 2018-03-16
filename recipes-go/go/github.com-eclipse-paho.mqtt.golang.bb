DESCRIPTION = "github.com/eclipse/paho.mqtt.golang"

GO_IMPORT = "github.com/eclipse/paho.mqtt.golang"

inherit go

SRC_URI = "git://github.com/eclipse/paho.mqtt.golang;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "d4f545eb108a2d19f9b1a735689dbfb719bc21fb" 
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3e75bb9ec12a51993bd30e51011b4229"

DEPENDS += "golang.org-x-net"

FILES_${PN} += "${GOBIN_FINAL}/*"
