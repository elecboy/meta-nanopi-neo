FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"

SRC_URI_append_nanopi-neo-core += "\
    file://watchdog.conf \
"
