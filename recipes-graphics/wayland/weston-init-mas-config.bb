SUMMARY = "Desktop config to customize weston init"
DESCRIPTION = "This is the MASELEttronica customization for weston init interface "
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://smoke.png \
           file://triangles.png \
           file://touch.png \
           file://editor.png \
           file://killall.png \
           file://camera.png \
           file://background-maselettronica.png \
           file://background-maselettronica-1024x600.png \
           file://terminal.png \
           file://wifi.png \
           file://qt-logo.png \
           file://chromium.png \
           file://video.png \
"

do_install() {
    install -d ${D}/usr/share/icons/maselettronica
    install -m 0644 ${WORKDIR}/smoke.png ${D}/usr/share/icons/maselettronica/smoke.png
    install -m 0644 ${WORKDIR}/triangles.png ${D}/usr/share/icons/maselettronica/triangles.png
    install -m 0644 ${WORKDIR}/touch.png ${D}/usr/share/icons/maselettronica/touch.png
    install -m 0644 ${WORKDIR}/camera.png ${D}/usr/share/icons/maselettronica/camera.png
    install -m 0644 ${WORKDIR}/editor.png ${D}/usr/share/icons/maselettronica/editor.png
    install -m 0644 ${WORKDIR}/killall.png ${D}/usr/share/icons/maselettronica/killall.png
    install -m 0644 ${WORKDIR}/terminal.png ${D}/usr/share/icons/maselettronica/terminal.png
    install -m 0644 ${WORKDIR}/qt-logo.png ${D}/usr/share/icons/maselettronica/qt-logo.png
    install -m 0644 ${WORKDIR}/wifi.png ${D}/usr/share/icons/maselettronica/wifi.png
    install -m 0644 ${WORKDIR}/chromium.png ${D}/usr/share/icons/maselettronica/chromium.png
    install -m 0644 ${WORKDIR}/video.png ${D}/usr/share/icons/maselettronica/video.png

    # set the background image depending on resolution defined on machine
    if [ "${DISPLAY_RESOLUTION}" = "1024x600" ]; then
		install -m 0644 ${WORKDIR}/background-maselettronica-1024x600.png ${D}/usr/share/icons/maselettronica/background-maselettronica.png
	else
		# 800x480
		install -m 0644 ${WORKDIR}/background-maselettronica.png ${D}/usr/share/icons/maselettronica/background-maselettronica.png
    fi
}

FILES:${PN} = "/usr/share/icons/maselettronica/*.png"

