package jio.System.Drawing.Imaging;

public enum PixelFormat {
  DontCare(0L),
  Max(15L),
  Indexed(65536L),
  Gdi(131072L),
  Format16bppRgb555(135173L),
  Format16bppRgb565(135174L),
  Format24bppRgb(137224L),
  Format32bppRgb(139273L),
  Format1bppIndexed(196865L),
  Format4bppIndexed(197634L),
  Format8bppIndexed(198659L),
  Alpha(262144L),
  Format16bppArgb1555(397319L),
  PAlpha(524288L),
  Format32bppPArgb(925707L),
  Extended(1048576L),
  Format16bppGrayScale(1052676L),
  Format48bppRgb(1060876L),
  Format64bppPArgb(1851406L),
  Canonical(2097152L),
  Format32bppArgb(2498570L),
  Format64bppArgb(3424269L),
  ;
  private long numVal;

  PixelFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
