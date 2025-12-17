SUMMARY = "MAS home configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_BRANCH = "iMX93-NEI000X0-dev-ds"
REPO_SRC = "git://git@git.maselettronica.com:22222/maselettronica/yocto/products/sbc/bsp/packages/mas-home-config.git;protocol=ssh"
SRC_URI = "${REPO_SRC};branch=${SRC_BRANCH}"
SRCREV = "46608499faf7fc380be9800b695ed889abd4f930"

S = "${WORKDIR}/git"

do_install() {
    install -d -m 0755 ${D}/root/
    install -d ${D}/${sysconfdir}/
    install -d ${D}/${sysconfdir}/systemd/network/
    install -m 0644 ${S}/bashrc ${D}/root/.bashrc
    install -m 0644 ${S}/profile ${D}/root/profile_bkp
    install -m 0644 ${S}/20-wired.network ${D}/${sysconfdir}/systemd/network/20-wired.network
    install -m 0644 ${S}/21-wired.network ${D}/${sysconfdir}/systemd/network/21-wired.network
    install -m 0644 ${S}/udhcp.conf ${D}/${sysconfdir}/udhcp.conf
    
}

FILES:${PN} += "/root/.bashrc /root/profile_bkp ${sysconfdir}"

