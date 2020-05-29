/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cain.util.sub.app.router;

import android.content.Context;

/**
 * <pre>
 *     desc   : 路由回调接口
 *     author : xuexiang
 *     time   : 2018/4/30 下午12:10
 * </pre>
 */
public interface RouterCallback {

    void onBefore(Context from, Class<?> to);

    void onNext(Context from, Class<?> to);

    void onError(Context from, Class<?> to, Throwable throwable);

}
