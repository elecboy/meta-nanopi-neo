SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"

inherit kernel

require linux.inc
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97"
COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i|sun8i)"

# Pull in the devicetree files into the rootfs
RDEPENDS_kernel-base += "kernel-devicetree"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

PV .= ""

# Pull in the devicetree files into the rootfs
RDEPENDS_kernel-base += "kernel-devicetree"

SRCREV = "79bf89b88a87f2ebf147f76d8c40183283b49b51"
SRC_URI = "git://github.com/megous/linux.git;protocol=git;branch=orange-pi-4.19 \
	file://defconfig \
  file://0001-add-usb2-usb3-to-nanopi-neo-air.patch \
  file://0002-enable-emmc-and-ap6212-bluetooth-uart3.patch \
  file://0003-enable-neo-air-i2c0.patch \
  file://0004-add-cpufreq-to-neo-air.patch \
  file://0005-add-ds3231-rtc-to-nano-pi-neo-air.patch \
  file://0006-add-rx8010-rtc-to-nanopi-neo-air.patch \
  file://0007-fix-rx8010-rtc-wakeup.patch \
  file://0008-rx8010-reset-err-variable-to-account.patch \
  file://0009-enable-neo-air-uart1.patch \
  file://0010-enable-nanopi-neo-air-emac.patch \
  file://0011-add-pcf8563-rtc-to-nanopi-neo-air.patch \
  file://0012-enable-nanopi-neo-air-usb-otg.patch \
  file://0013-enable-usb-0-1-on-nanopi-neo-core.patch \
  file://fix-patch-4.19.12-13.patch \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.13-14.xz;name=patch_14;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.14-15.xz;name=patch_15;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.15-16.xz;name=patch_16;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.16-17.xz;name=patch_17;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.17-18.xz;name=patch_18;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.18-19.xz;name=patch_19;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.19-20.xz;name=patch_20;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.20-21.xz;name=patch_21;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.21-22.xz;name=patch_22;apply=yes \
  https://cdn.kernel.org/pub/linux/kernel/v4.x/incr/patch-4.19.22-23.xz;name=patch_23;apply=yes \
"

SRC_URI[patch_14.md5sum] = "7f448c42ead61bb116d53134aa03cf25"
SRC_URI[patch_14.sha256sum] = "e906e6c2889862eac8169f0b8d30d5d2b4b0ae3f43e2c25bdda20f6aa1a4bf89"
SRC_URI[patch_15.md5sum] = "f4420976df9b8bde7d8e39991541a8ef"
SRC_URI[patch_15.sha256sum] = "51bf2fb1221241cd3319e3bdc328d7de89f1f8561e14df05777ddc00f3255db2"
SRC_URI[patch_16.md5sum] = "8e7c8e4e19e8bc131cca141387029dc5"
SRC_URI[patch_16.sha256sum] = "3f6ee71e08a4035045c3ad3c02a0afbc6c7b6d508542e4ca16c752ce29d934cd"
SRC_URI[patch_17.md5sum] = "65c80615278ff38b2e20bf0baef518f9"
SRC_URI[patch_17.sha256sum] = "575a9180dee58c1e012294e1d4a1ea1676d9d3bb3f0b9d3a13220357031e59cd"
SRC_URI[patch_18.md5sum] = "54f0d18afee79c2b14005b3881ccab14"
SRC_URI[patch_18.sha256sum] = "dd389d4f84a794dec0fea523fb351dadc0d0c37de1ed6c406d4f0584ca1b6d09"
SRC_URI[patch_19.md5sum] = "c8214629dfd3bdce8d606907e105dbfb"
SRC_URI[patch_19.sha256sum] = "b0af074faf9601581ba68f9120a80e09ce8b2982c4e2e586dc9dca840a82b336"
SRC_URI[patch_20.md5sum] = "8689958359c4781733ea3cee5f0da315"
SRC_URI[patch_20.sha256sum] = "19683cf95023c9e82f7eb1e268b494b5295f061c1126f0b2645b5458eac816e6"
SRC_URI[patch_21.md5sum] = "1b4144a1a4fb3181d9e409db6c3f6e7d"
SRC_URI[patch_21.sha256sum] = "224c11ef19d777f13a75732cbd219771afd0723306b2fdf323a16d168aa4043d"
SRC_URI[patch_22.md5sum] = "2aa663ddc39dd42a9c6257ed957c3477"
SRC_URI[patch_22.sha256sum] = "bbbe23a9f55b1084ecbe08b0818c50c5bdc9416c07e7dc2da2bfd55ec8515b97"
SRC_URI[patch_23.md5sum] = "c8de687e863525e34c88658a6aeeb913"
SRC_URI[patch_23.sha256sum] = "0af018169199da935de22ff602619cb92681dad86c15409e223ac8f3b6ce9677"
# SRC_URI[patch_24.md5sum] = "6b597e7b2f018738c8f58974476108b1"
# SRC_URI[patch_24.sha256sum] = "d64600c69ef7d0e58aa5c9efa63881226a38404f6e3e89af93bb24160af5ec8d"
# SRC_URI[patch_25.md5sum] = "a964a2d0a2faa9c5b8980eb19ced1ca3"
# SRC_URI[patch_25.sha256sum] = "e95a2bb816669deeac4ffc5d5d00f567696bb3f76b44d040de6d9217a9923a74"

S = "${WORKDIR}/git"
