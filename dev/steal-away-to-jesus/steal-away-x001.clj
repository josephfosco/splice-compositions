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
     :dur {:type :variable-inc-millis
           :dur-millis 46687.5
           :dec-millis 5000
           :inc-millis 5000}
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
     :dur {:type :variable-inc-millis
           :dur-millis 46500
           :dec-millis 5000
           :inc-millis 5000}
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
     :dur {:type :variable-inc-millis
           :dur-millis 45000
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 43687.5
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 43500
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 42000
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 40687.5
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 40500
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 39187.5
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 39000
           :dec-millis 5000
           :inc-millis 5000
           }
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
     :dur {:type :variable-inc-millis
           :dur-millis 38250
           :dec-millis 5000
           :inc-millis 5000
           }
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
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 36000} :dec-millis 5000 :inc-millis 5000}
    ]}

  ;; ------------ mm 5 ------------

  {:name "note-5-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 12000}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1312.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 34687.5 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-5-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 13312.5}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 34500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-5-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 13500}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 33000 :dec-millis 5000 :inc-millis 5000}}
    ]}


  {:name "note-6-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 15000}}
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 31875 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-6-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 16125}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 31687.5 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-6-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 16312.5}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 31500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-6-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 16500}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 30375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-6-5"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 17625}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 30000 :dec-millis 5000 :inc-millis 5000}}
    ]}


  {:name "note-7-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 18000}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 29250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-7-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 18750}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 28500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-7-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 19500}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 27375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-7-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 20625}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 27000 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-8-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 21000}}
    {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 26250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-8-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 21750}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 24000 :dec-millis 5000 :inc-millis 5000}}
    ]}

  ;; ------------ mm 9 ------------

  {:name "note-9-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 24000}}
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 22500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-9-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 25500}}
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 21375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-9-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 26625}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 21000 :dec-millis 5000 :inc-millis 5000}}
    ]}



  {:name "note-10-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 27000}}
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 20250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-10-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 27750}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 18750 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-10-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 29250}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 18000 :dec-millis 5000 :inc-millis 5000}}
    ]}



  {:name "note-11-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 30000}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 16875 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-11-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 31125}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 16500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-11-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 31500}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 15375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-11-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 32625}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 15000 :dec-millis 5000 :inc-millis 5000}}
    ]}



  {:name "note-12-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 33000}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 14250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-12-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 33750}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 12750 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-12-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 35250}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 12000 :dec-millis 5000 :inc-millis 5000}}
    ]}

  ;; ------------ mm 13 ------------

  {:name "note-13-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 36000}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 11625 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-13-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 36325}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 10500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-13-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 37500}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 9375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-13-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 38625}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 9000 :dec-millis 5000 :inc-millis 5000}}
    ]}



  {:name "note-14-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 39000}}
    {:pitch {:type :fixed
             :pitch-midi-note 74}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 8625 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-14-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 39375}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 8250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-14-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 39750}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 7500 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-14-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 40500}}
    {:pitch {:type :fixed
             :pitch-midi-note 72}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 6375 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-14-5"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 41625}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 6000 :dec-millis 5000 :inc-millis 5000}}
    ]}



  {:name "note-15-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 42000}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 5250 :dec-millis 5000 :inc-millis 5000}}
    ]}

  {:name "note-15-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 42750}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 4500 :dec-millis 1000 :inc-millis 1000}}
    ]}

  {:name "note-15-3"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 43500}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 3375 :dec-millis 1000 :inc-millis 1000}}
    ]}

  {:name "note-15-4"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 44625}}
    {:pitch {:type :fixed
             :pitch-midi-note 69}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 3000 :dec-millis 1000 :inc-millis 1000}}
    ]}



  {:name "note-16-1"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 45000}}
    {:pitch {:type :fixed
             :pitch-midi-note 67}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest} :dur {:type :variable-inc-millis :dur-millis 2250 :dec-millis 1000 :inc-millis 1000}}
    ]}

  {:name "note-16-2"
   :loop-type :loop
   :instrument-name :wurlitzer-piano
   :melody-info
   [
    {:pitch {:type :rest} :dur {:type :fixed :dur-millis 45750}}
    {:pitch {:type :fixed
             :pitch-midi-note 65}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }
    ]}

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
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 2 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 3 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 2812.500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 187.5}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 4 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 48}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 5 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 7 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 375}
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

    ;; ------------ mm 8 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 9 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 46}
     :dur {:type :fixed
           :dur-millis 2625}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 10 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 34}
     :dur {:type :fixed
           :dur-millis 750}
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
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 11 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 12 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 48}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 13 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 3000}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 14 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 1500}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 36}
     :dur {:type :fixed
           :dur-millis 375}
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 15 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 1125}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 38}
     :dur {:type :fixed
           :dur-millis 375}
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

    ;; ------------ mm 16 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 48}
     :dur {:type :fixed
           :dur-millis 750}
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 41}
     :dur {:type :fixed
           :dur-millis 2250}
     :volume {:type :fixed
              :level 0.7}
     }

    ]}


  ]}
