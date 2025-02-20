SUMMARY = "MAS test suite for NEI000X0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_BRANCH = "${MASTESTSUITE_SRCBRANCH}"
SRCREV = "${MASTESTSUITE_SRCREV}"
REPO_SRC = "git://git@git.maselettronica.com:22222/maselettronica/yocto/products/sbc/bsp/packages/test-mas.git;protocol=ssh"
SRC_URI = "${REPO_SRC};branch=${SRC_BRANCH}"

S = "${WORKDIR}/git"

TEST_DIR = "test-mas"

RDEPENDS:${PN} += "bash"

do_install() {
    install -d -m 0755 ${D}/home/root/
    install -d -m 0755 ${D}/home/root/${TEST_DIR}
    cp -rp ${S}/* ${D}/home/root/${TEST_DIR}/
    chown -R root:root ${D}/home/root/${TEST_DIR}/
}

FILES:${PN} += "/home/root/${TEST_DIR}"
