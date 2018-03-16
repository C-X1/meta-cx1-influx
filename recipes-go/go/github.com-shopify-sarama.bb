DESCRIPTION = "github.com/Shopify/sarama"

GO_IMPORT = "github.com/Shopify/sarama"

inherit go

SRC_URI = "git://github.com/Shopify/sarama;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "46dabe0f34a162d428640a0e9714eea9079e7ee2" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=08a9a8182981c4db69e7e7bae5edc2e7"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS+="\
    github.com-eapache-go-resiliency\
    github.com-eapache-go-xerial-snappy\
    github.com-eapache-queue\
    github.com-klauspost-crc32\
    github.com-pierrec-lz4\
    github.com-rcrowley-go-metrics\
    github.com-davecgh-go-spew \
    github.com-shopify-toxiproxy \
    "
