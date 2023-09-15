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
  {:name "note-1-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-loop-delay-ms 100
   :max-new-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 875
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 125
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1000
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 100
           :dur-var-ignore-for-nt-note true
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 3000
           }
     }
     ]}


  ]}
