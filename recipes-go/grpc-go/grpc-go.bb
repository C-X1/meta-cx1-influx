DESCRIPTION = "The Go language implementation of gRPC. HTTP/2 based RPC including its circular (F#CKING) dependencies"
SECTION = "net"
HOMEPAGE = "https://github.com/grpc/grpc-go"

inherit go
GO_IMPORT = ""
GO_IMPORT_GRPC     = "google.golang.org/grpc"
GO_IMPORT_OAUTH2   = "golang.org/x/oauth2"
GO_IMPORT_GENPROTO = "google.golang.org/genproto"
GO_IMPORT_CLOUD    = "cloud.google.com/go"
GO_IMPORT_GAX_GO   = "github.com/googleapis/gax-go"
GO_IMPORT_API      = "google.golang.org/api"

###### PROVIDES  = "grpc-go"
PROVIDES += "golang.org-genproto"
PROVIDES += "golang.org-x-oauth2"
PROVIDES += "cloud.google.com-go"
PROVIDES += "github.com-googleapis-gax-go"
PROVIDES += "google.golang.org-api"



LICENSE = "BSD-3-Clause & Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT_GRPC}/LICENSE;md5=a4bad33881612090c6035d8393175996     \
                    file://src/${GO_IMPORT_OAUTH2}/LICENSE;md5=704b1e0c436dbf193e7dcbd4cf06ec81   \
                    file://src/${GO_IMPORT_GENPROTO}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/${GO_IMPORT_CLOUD}/LICENSE;md5=a873c5645c184d51e0f9b34e1d7cf559    \
                    file://src/${GO_IMPORT_GAX_GO}/LICENSE;md5=0dd48ae8103725bd7b401261520cdfbb   \
                    file://src/${GO_IMPORT_API}/LICENSE;md5=a651bb3d8b1c412632e28823bb432b40      \
                    "

DEPENDS = "\
	github.com-golang-glog \
	github.com-golang-protobuf \
	golang.org-x-net \
	golang.org-x-text \
	golang-x-sync \
	"
	

#### FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "git://github.com/grpc/grpc-go.git;protocol=https;name=grpc;destsuffix=${PN}-${PV}/src/${GO_IMPORT_GRPC}     \
           git://github.com/google/go-genproto.git;protocol=https;name=genproto;destsuffix=${PN}-${PV}/src/${GO_IMPORT_GENPROTO} \
           git://github.com/googleapis/gax-go.git;protocol=https;name=gaxgo;destsuffix=${PN}-${PV}/src/${GO_IMPORT_GAX_GO}   \
           git://github.com/golang/oauth2.git;protocol=https;name=oauth2;destsuffix=${PN}-${PV}/src/${GO_IMPORT_OAUTH2}   \ 
           git://github.com/google/google-api-go-client;protocol=https;name=api;destsuffix=${PN}-${PV}/src/${GO_IMPORT_API} \  
           git://code.googlesource.com/gocloud;protocol=https;name=cloud;destsuffix=${PN}-${PV}/src/${GO_IMPORT_CLOUD}    \
           "

GO_INSTALL = "\
    ${GO_IMPORT_GRPC}/codes/... \
    ${GO_IMPORT_GRPC}/credentials/... \
    ${GO_IMPORT_GRPC}/grpclog/... \
    ${GO_IMPORT_GRPC}/internal/... \
    ${GO_IMPORT_GRPC}/metadata/... \
    ${GO_IMPORT_GRPC}/naming/... \
    ${GO_IMPORT_GRPC}/peer/... \
    ${GO_IMPORT_GRPC}/transport/... \
    ${GO_IMPORT_GENPROTO}/genproto/googleapis/... \
    ${GO_IMPORT_GENPROTO}/genproto/protobuf/... \
    ${GO_IMPORT_GAX_GO}/... \
    ${GO_IMPORT_CLOUD}/metadata/... \
    ${GO_IMPORT_CLOUD}/internal/... \
    ${GO_IMPORT_GENPROTO}/... \
    ${GO_IMPORT_OAUTH2}/... \
"

SRCREV_grpc =    "8a6eb0f6e96a246c7c655b0207b62255042f6fbd"
SRCREV_genproto= "411e09b969b1170a9f0c467558eb4c4c110d9c77"
SRCREV_oauth2 =   "a6bd8cefa1811bd24b86f8902872e4e8225f74c4" 
SRCREV_cloud =   "1ec09e65be459e9a0c9014ff8e4591d8c2f1bed6"
SRCREV_gaxgo =   "9af46dd5a1713e8b5cd71106287eba3cefdde50b"
SRCREV_api   =   "16ab375f94503bfa0d19db78e96bffbe1a34354f"

RDEPENDS_${PN}-dev += "bash"

FILES_${PN} += "${GOBIN_FINAL}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_GRPC}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_OAUTH2}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_GENPROTO}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_CLOUD}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_GAX_GO}/*"
FILES_${PN} += "${GOBIN_FINAL}/${GO_IMPORT_API}/*"





