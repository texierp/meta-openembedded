SUMMARY = "Count blank lines, comment lines, and physical lines of source code \
in many programming languages."
AUTHOR = "Al Danial"

LICENSE="GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

SRC_URI = "https://github.com/AlDanial/cloc/releases/download/${PV}/${BP}.tar.gz"
SRC_URI[sha256sum] = "67b7e50a03b02903142e20380c7716bdb53061132d5e0df9de4a638b271267e3"

UPSTREAM_CHECK_URI = "https://github.com/AlDanial/${BPN}/releases"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -D -m 0755 ${S}/cloc ${D}${bindir}/cloc
}

RDEPENDS_${PN} = "perl perl-modules"
