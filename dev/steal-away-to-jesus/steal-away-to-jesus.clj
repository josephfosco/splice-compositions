;    Copyright (C) 2023  Joseph Fosco. All Rights Reserved
;
;    This program is free software: you can redistribute it and/or modify
;    it under the terms of the GNU General Public License as published by
;    the Free Software Foundation, either version 3 of the License, or
;    (at your option) any later version.
;
;    This program is distributed in the hope that it will be useful,
;    but WITHOUT ANY WARRANTY; without even the implied warranty of
;    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;    GNU General Public License for more details.
;
;    You should have received a copy of the GNU General Public License
;    along with this program.  If not, see <http://www.gnu.org/licenses/>.

{;; :min-start-offset 0
 ;; :max-start-offset 0

 ;; :main-bus-effects
 ;; {"reverb-2ch" ("vol" 0.8 "mix" 1.0 "room" 0.95)}

 ;; :loops
 ;; [
 ;;  {:name "tune-loop"
 ;;   :loop-type :loop
 ;;   :instrument-name :wurlitzer-piano
 ;;   :melody-info
 ;;   [
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 65}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1312.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 65}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 187.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 65}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1500}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }

 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 69}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1312.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 69}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 187.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 69}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1500}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }

 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 72}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1312.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 72}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 187.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 72}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 1312.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 74}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 187.5}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }

 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 67}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 750}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }
 ;;    {:pitch {:type :fixed
 ;;             :pitch-midi-note 69}
 ;;     :dur {:type :fixed
 ;;           :dur-millis 2250}
 ;;     :volume {:type :fixed
 ;;              :level 0.7}
 ;;     }

    ;; ------------ mm 5 ------------

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1750}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 250}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 2000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 74}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 250}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 250}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 67}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 3000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; ;; ------------ mm 9 ------------

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 74}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 2000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 74}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 250}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 74}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 2000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 2000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }

    ;; ;; ------------ mm 13 ------------

    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 74}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 72}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 69}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 500}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 67}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 1000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
    ;; {:pitch {:type :fixed
    ;;          :pitch-midi-note 65}
    ;;  :dur {:type :fixed
    ;;        :dur-millis 3000}
    ;;  :volume {:type :fixed
    ;;           :level 0.7}
    ;;  }
   ;;  ]
   ;; }

 :loops
 [
  {:name "note-1-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1312.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 10687.5}
     }
     ]}

  {:name "note-1-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 1312.5}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 10500}
     }
    ]}

  {:name "note-1-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 1500}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 9000}
     }
     ]}

  {:name "note-2-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 3000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1312.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 7687.5}
     }
    ]}

  {:name "note-2-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 4312.5}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 7500}
     }
     ]}

  {:name "note-2-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 4500}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 6000}
     }
     ]}


  {:name "note-3-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 6000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1312.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 4687.5}
     }
    ]}

  {:name "note-3-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 7312.5}
     }
  {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
   }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 4500}
     }

    ]}

  {:name "note-3-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 7500}
     }
  {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1312.5}
     :volume {:type :fixed
              :level 0.7}
   }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 3187.5}
     }
    ]}

   {:name "note-3-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 8812.5}
     }
   {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 3000}
     }
     ]}


  {:name "note-4-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 9000}
     }
  {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
   }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 2250}
     }

    ]}

   {:name "note-4-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 9750}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }]
   }

  ]}
