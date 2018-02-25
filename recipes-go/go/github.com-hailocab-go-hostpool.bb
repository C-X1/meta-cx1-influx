DESCRIPTION = "github.com/hailocab/go-hostpool"

GO_IMPORT = "github.com/hailocab/go-hostpool"

inherit go

SRC_URI = "git://github.com/hailocab/go-hostpool;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "e80d13ce29ede4452c43dea11e79b9bc8a15b478" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6747d3f533dc3a43a1a26eaa57170557"

DEPENDS += "github.com-bitly-go-hostpool github.com-bmizerany-assert"

FILES_${PN} += "${GOBIN_FINAL}/*"

do_compile_ptest_base() {
	:
}
