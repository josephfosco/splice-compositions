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

 :loops
 [
  {:name "tune-loop"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 5 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 9 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 10 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 11 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }

    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 13 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }
    ]
   }

  ;; -----------------------------------------------
  ;;
  ;;                BASS
  ;;
  ;; -----------------------------------------------

  {:name "bass"
   :loop-type :loop
   :instrument-name :rhodes-piano
   :melody-info
   [

    ;; ------------ mm 1 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 2 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 3 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 250}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 4 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 48}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 5 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 6 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 7 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 8 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 9 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 10 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 11 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 12 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 13 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 4000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 14 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 15 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 2000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 16 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 1000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ]}

  ]}
