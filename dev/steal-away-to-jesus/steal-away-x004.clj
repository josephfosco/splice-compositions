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
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
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
           :dur-var-max-pct-inc 400
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 30000
           :dec-millis 750
           :inc-millis 750}
     }
     ]}

    ;; ------------ mm 2 ------------

  {:name "note-2-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 2000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
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
             :pitch-midi-note 69
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
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1000
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 200
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 28000
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

    ;; ------------ mm 3 ------------

  {:name "note-3-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 4000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
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
             :pitch-midi-note 72
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
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 875
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 200
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 26125
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-3-4"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 5875}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74
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

    ;; ------------ mm 4 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 67
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 100
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 24000
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

    ;; ------------ mm 5 ------------

  {:name "note-5-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 8000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 875
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
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
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
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
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 22000
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

    ;; ------------ mm 6 ------------

  {:name "note-6-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 10000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 125
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 125
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 20250
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-6-5"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 11750}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 7 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
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
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 18250
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-7-4"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 13750}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 8 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 67
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
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
           :dur-millis 1500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 16000
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

    ;; ------------ mm 9 ------------

  {:name "note-9-1"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 16000}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1000
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 74
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 10 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 74
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1000
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 12500
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-10-3"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 19500}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 11 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    ;; ------------ mm 12 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 1000
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 8500
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-12-3"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 23500}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 13 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 6250
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-13-4"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 25750}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 14 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 74
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 400
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 72
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 320
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 4250
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-14-5"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 27750}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           :dur-var-first-rep 7
           :dur-var-prob 50
           :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 15 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 65
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
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
           :dur-millis 500
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 750
           :dur-var-first-rep 9
           :dur-var-prob 33
           :dur-var-max-pct-inc 50
           :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 2250
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  {:name "note-15-4"
   :loop-type :multiplying-loop
   :instrument-name :flute
   :max-num-mult-loops 12
   :loop-mult-probability 100
   :min-new-mult-loop-delay-ms 100
   :max-new-mult-loop-delay-ms 200
   :melody-info
   [
    {:pitch {:type :rest}
     :dur {:type :fixed
           :dur-millis 29750}
     }
    {:pitch {:type :fixed
             :pitch-midi-note 69
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 250
           ;; :dur-var-first-rep 7
           ;; :dur-var-prob 50
           ;; :dur-var-max-pct-inc 200
           }
     :volume {:type :fixed
              :level 0.7}
     }

    ;; ------------ mm 16 ------------

    {:pitch {:type :fixed
             :pitch-midi-note 67
             :pitch-var-first-rep 3
             :pitch-var-prob 25
             :pitch-var-max-inc 15
             :pitch-var-max-dec 15
             }
     :dur {:type :fixed
           :dur-millis 500
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
           :dur-millis 1500
           ;; :dur-var-first-rep 9
           ;; :dur-var-prob 33
           ;; :dur-var-max-pct-inc 50
           ;; :dur-var-max-pct-dec 10
           }
     :volume {:type :fixed
              :level 0.7}
     }
    {:pitch {:type :rest}
     :dur {:type :variable-inc-millis
           :dur-millis 0
           :dec-millis 750
           :inc-millis 750}
     }
    ]}

  ;; -----------------------------------------------
  ;;
  ;;                BASS
  ;;
  ;; -----------------------------------------------

  ;; {:name "bass"
  ;;  :loop-type :loop
  ;;  :instrument-name :clarinet
  ;;  :melody-info
  ;;  [

  ;;   ;; ------------ mm 1 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 2 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 3 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1875}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 46}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 125}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 4 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 48}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 5 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 6 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 46}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 750}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 250}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 7 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 750}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 250}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 8 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 9 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 46}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 10 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 11 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 12 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 13 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 2000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 14 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 750}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 250}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 15 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 750}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 38}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 250}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1000}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ;; ------------ mm 16 ------------

  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 36}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }
  ;;   {:pitch {:type :fixed
  ;;            :pitch-midi-note 41}
  ;;    :dur {:type :fixed
  ;;          :dur-millis 1500}
  ;;    :volume {:type :fixed
  ;;             :level 0.7}
  ;;    }

  ;;   ]}

  ]}
