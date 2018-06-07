package com.speldipn.example.this_is_java.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Earth {
  static final double EARTH_RADIUS = 6400;
  static final double EARTH_SURFACE_AREA;

  static {
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }
}
