FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://weston-mas.ini \
			file://weston-mas-hdmi.ini \
"

FILE2SEARCH = "${D}${sysconfdir}/xdg/weston/weston.ini"

do_install:append() {
    install -d ${D}${sysconfdir}/xdg/weston

    if [ "${DISPLAY_TYPE}" = "hdmi" ]; then
		install -m 0644 ${WORKDIR}/weston-mas-hdmi.ini ${D}${sysconfdir}/xdg/weston/weston.ini
    else
		install -m 0644 ${WORKDIR}/weston-mas.ini ${D}${sysconfdir}/xdg/weston/weston.ini

		# edit the weston.ini to adjust the screen resolution based on the one set in the machine
		if [ -n ${DISPLAY_RESOLUTION} ]; then
			if [ $(grep -c "size=" ${FILE2SEARCH}) -eq 1 ]; then
				sed -i "/size=/c\size=${DISPLAY_RESOLUTION}" ${FILE2SEARCH}
			fi
		fi
	fi

}
