// Generated code from Butter Knife. Do not modify!
package sui.yuchen.fast.demo;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final sui.yuchen.fast.demo.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230721, "field 'mTextView'");
    target.mTextView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131230720, "method 'btn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btn();
        }
      });
  }

  public static void reset(sui.yuchen.fast.demo.MainActivity target) {
    target.mTextView = null;
  }
}
