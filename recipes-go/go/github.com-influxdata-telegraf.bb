DESCRIPTION = "github.com/influxdata/telegraf"

GO_IMPORT = "github.com/influxdata/telegraf"

inherit go

SRC_URI = "git://github.com/influxdata/telegraf;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "b968759d1015f47bf60de5ec05e762a994692110"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=10a23e7a514f23f0930e1a4254936534"

FILES_${PN} += "${GOBIN_FINAL}/*"

DEPENDS +="\
    collectd\
    go-collectd.org\
    github.com-davecgh-go-spew\
    github.com-golang-protobuf\
    github.com-golang-snappy\
    github.com-sirupsen-logrus\
    github.com-docker-docker\
    golang.org-x-crypto\
    golang.org-x-net\
    golang.org-x-text\
    github.com-gobwas-glob\
    github.com-influxdata-toml\
    github.com-shopify-sarama\
    github.com-aerospike-aerospike-client-go\
    github.com-amir-raidman\
    github.com-aws-aws-sdk-go\
    github.com-couchbase\
    github.com-eclipse-paho.mqtt.golang\
    github.com-go-sql-driver-mysql\
    github.com-gorilla-mux\
    github.com-hashicorp-consul\
    github.com-influxdata-tail\
    github.com-influxdata-wlog\
    github.com-jackc-pgx\
    github.com-kardianos-service\
    github.com-kballard-go-shellquote\
    github.com-miekg-dns\
    github.com-nats-io-nats\
    github.com-nsqio-go-nsq\
    github.com-prometheus-client-model\
    github.com-prometheus\
    github.com-shirou-gopsutil\
    github.com-soniah-gosnmp\
    github.com-vjeantet-grok\
    github.com-wvanbergen-kafka\
    github.com-zensqlmonitor-go-mssqldb\
    gopkg.in-dancannon-gorethink.v1\
    gopkg.in-mgo.v2\
    gopkg.in-yaml.v2\
    github.com-streadway-amqp\
    gopkg.in-olivere-elastic.v5\
"

RDEPENDS_${PN}-dev += "bash \
                             python \
                             "