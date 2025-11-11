FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

DEPENDS:append:mx8ulp-nxp-bsp = " imx-lib"
DEPENDS:append:mx93-nxp-bsp = " imx-lib"

SRC_URI:append = " \
           file://profile"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx95-nxp-bsp = "IMX8"


addtask custom after do_install before do_package
do_custom () {
	install -d -m 0755 ${D}${ROOT_HOME}/
	install -m 0644 ${WORKDIR}/profile ${D}${ROOT_HOME}/profile_bkp

	cat ${D}${ROOT_HOME}/profile_bkp >> ${D}${ROOT_HOME}/.profile
	rm ${D}${ROOT_HOME}/profile_bkp
}

FILES:${PN} += "${ROOT_HOME}/profile_bkp"
RDEPENDS:${PN} = "bash"
