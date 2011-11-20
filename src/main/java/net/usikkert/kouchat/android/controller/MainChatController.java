
/***************************************************************************
 *   Copyright 2006-2011 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This file is part of KouChat.                                         *
 *                                                                         *
 *   KouChat is free software; you can redistribute it and/or modify       *
 *   it under the terms of the GNU General Public License as               *
 *   published by the Free Software Foundation, either version 3 of        *
 *   the License, or (at your option) any later version.                   *
 *                                                                         *
 *   KouChat is distributed in the hope that it will be useful,            *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the          *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with KouChat. If not, see <http://www.gnu.org/licenses/>.       *
 ***************************************************************************/

package net.usikkert.kouchat.android.controller;

import android.app.Activity;
import android.os.Bundle;

/**
 * Controller for the main chat.
 *
 * @author Christian Ihle
 */
public class MainChatController extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        System.out.println("MainChatController " + this + ": onCreate !!!!!!!!!!!!!");

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("MainChatController " + this + ": onDestroy !!!!!!!!!!!!!");

        super.onDestroy();
    }
}
