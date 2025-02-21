SUMMARY = "Custom Application init service"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

RDEPENDS_${PN} += "busybox"

SRC_URI = "file://custom-app-init.service \
           file://launch_app.sh \
          "

inherit systemd

SYSTEMD_SERVICE:${PN} = "custom-app-init.service"

do_install() {
	install -d -m 0755 ${D}/root/
	install -d ${D}${systemd_unitdir}/system
	install -m 0644 ${WORKDIR}/custom-app-init.service ${D}${systemd_unitdir}/system/
	install -m 0755 ${WORKDIR}/*.sh ${D}/root/
}

FILES:${PN} += "/root/launch_app.sh "
