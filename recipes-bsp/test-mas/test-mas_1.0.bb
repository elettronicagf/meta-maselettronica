SUMMARY = "MAS test suite for NEI000X0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_BRANCH = "${MASTESTSUITE_SRCBRANCH}"
SRCREV = "${MASTESTSUITE_SRCREV}"
SRC_URI = "${BASE_URL}/repo-shared/tests/test-suite.git;${BASE_PROTOCOL};branch=${SRC_BRANCH}"

S = "${WORKDIR}/git"

TEST_DIR = "test-mas"

RDEPENDS:${PN} += "bash"

do_install() {
    install -d -m 0755 ${D}/root/
    install -d -m 0755 ${D}/root/${TEST_DIR}
    cp -rp ${S}/* ${D}/root/${TEST_DIR}/
    chown -R root:root ${D}/root/${TEST_DIR}/
}

FILES:${PN} += "/root/${TEST_DIR}"
