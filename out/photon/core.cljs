(ns photon.core
  (:require [react]))

(.log js/console react/Component)

#_(defn get-canvas-context-from-id
  []
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")
        _ (.drawImage ctx (.getElementById js/document "img") 0 0)
        image (photon/open_image canvas ctx)
        _ (photon/grayscale image)]
    (photon/putImageData canvas ctx image)))

#_(get-canvas-context-from-id)