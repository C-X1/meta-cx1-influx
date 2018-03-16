require grafana.inc
inherit go

DESCRIPTION = "Grafana Go Backend"
GO_IMPORT = "${REPO}"
SRC_URI = "git://${REPO};protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=${LIC_CHKSUM}"

FILES_${PN} += "${GOBIN_FINAL}/*"

LDFLAGS += "-pthread"

DEPENDS+= "\
    github.com-couchbase-go-couchbase \
    github.com-kr-pty \
    github.com-lunny-nodb \
    github.com-siddontang-ledisdb \
    github.com-edsrzf-mmap-go \
    grpc-go \
"
GO_INSTALL = "\
      ${GO_IMPORT}/pkg/...  \
"
DEPENDS += "nodejs-native"

do_compile_append() {
    cd ${S}/src/${GO_IMPORT}
    npm install -g yarn
    yarn install --pure-lockfile
    npm run build
}

do_install_append() {
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/iltorb/build/bindings/iltorb.node
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/node-sass/vendor/linux-x64-57/binding.node
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/phantomjs-prebuilt/lib/phantom/bin/phantomjs
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/tools/phantomjs/phantomjs
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/grunt-cli/completion/zsh
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/node-gyp/gyp/samples/samples
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/mobx-react-devtools/publish.js
	rm -rf ${D}${libdir}/go/src/github.com/grafana/grafana/node_modules/npm/node_modules/node-gyp/gyp/samples/samples
}

CLEANBROKEN = "1"

RDEPENDS_${PN}-dev += "\
                             bash \
                             expect \
                             perl \
                            "
INSANE_SKIP_${PN} += "already-stripped"
