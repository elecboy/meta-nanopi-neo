FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
	    file://0001-new-target-nanopi-neo-core-cp-from-nanopi-neo.patch \
		file://0002-enable-emmc-on-nanopi-neo-core.patch \
		file://0003-fix-nanopi-neo-core-device-tree-name.patch \
		file://0004-nanopi_neo_core_defconfig-enable-emmc-support.patch \
"
