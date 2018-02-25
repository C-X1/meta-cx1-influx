DESCRIPTION = "Couchbase"
SECTION = "net"

LICENSE = "Apache-2.0 & MIT & CLOSED"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/cbauth/LICENSE;md5=LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/${GO_IMPORT}/go-couchbase/LICENSE;md5=8c0ee51d47029f985fab1143191e0402 \
                    file://src/${GO_IMPORT}/gomemcached/LICENSE;md5=36b595bc1ba2cd69b35c21baf8127264 \
                    file://src/${GO_IMPORT}/goutils/LICENSE.md;md5=7db2e0e1e7be75cb5e3be24814ba1503 \  
                    file://src/${GO_IMPORT}/go_n1ql/LICENSE;md5=d2794c0df5b907fdace235a619d80314 \  
                    " 

GO_IMPORT = "github.com/couchbase"

PROVIDES += "\
    github.com-couchbase-cbauth \
    github.com-couchbase-go-couchbase \
    github.com-couchbase-gomemcached \ 
    github.com-couchbase-goutils \
    github.com-couchbase-go-n1ql \
"

inherit go

SRC_URI="git://github.com/couchbase/cbauth;protocol=https;name=cbauth;destsuffix=${PN}-${PV}/src/github.com/couchbase/cbauth \
         git://github.com/couchbase/go-couchbase;protocol=https;name=gocouchbase;destsuffix=${PN}-${PV}/src/github.com/couchbase/go-couchbase \
         git://github.com/couchbase/gomemcached;protocol=https;name=gomemcached;destsuffix=${PN}-${PV}/src/github.com/couchbase/gomemcached \
         git://github.com/couchbase/goutils;protocol=https;name=goutils;destsuffix=${PN}-${PV}/src/github.com/couchbase/goutils \
         git://github.com/couchbase/go_n1ql;name=gon1ql;protocol=https;destsuffix=${PN}-${PV}/src/github.com/couchbase/go_n1ql \
        "
        
SRCREV_cbauth = "7033a1743a2dac093e1f4707f2ae465f1fc4f21b"
SRCREV_gocouchbase = "67035e75f58e66670b74d7eae1c52f5c9babc105" 
SRCREV_gomemcached = "4a25d2f4e1dea9ea7dd76dfd943407abf9b07d29"
SRCREV_goutils = "5823a0cbaaa9008406021dc5daf80125ea30bba6"
SRCREV_gon1ql = "6cf4e348b127e21f56e53eb8c3faaea56afdc588"

GO_INSTALL = "\
    ${GO_IMPORT}/cbauth \
    ${GO_IMPORT}/go-couchbase \
    ${GO_IMPORT}/gomemcached \
    ${GO_IMPORT}/gomemcached/client \
    ${GO_IMPORT}/gomemcached/gocache \
    ${GO_IMPORT}/gomemcached/server \
    ${GO_IMPORT}/goutils/... \
    ${GO_IMPORT}/go_n1ql \
    "

DEPENDS+="\
   github.com-pallinder-go-randomdata \
   github.com-couchbase-clog \
"
do_compile_ptest_base() {
	:
}
