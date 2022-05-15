-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2022 a las 23:24:30
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quark_tech_mobile`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `id_client` int(11) NOT NULL,
  `name_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_telephone_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `identity_card_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_identity_card_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction_client` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `direction_tienda` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(11) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de clientes';

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`id_client`, `name_client`, `telephone_client`, `unformat_telephone_client`, `identity_card_client`, `unformat_identity_card_client`, `direction_client`, `direction_tienda`, `registered_by`, `last_modification`) VALUES
(1, 'Neifer Revero', '0414 - 214.46.84', '04142144684', 'V-27.915.4/8', 'V279154/8', 'Charallave', 'Almacen', '1', '1'),
(2, 'asda', '1231 - 231', '1231231', 'a.sda.sda', 'asdasda', 'asdasd', 'Almacen', '1', '0'),
(3, 'Abraham', '0414 - 589.65.55', '04145896555', 'V1.256.985', 'V1256985', 'Vallecito 1', 'Almacen', '1', ''),
(4, 'asdas', '1231 - 231.23.12', '12312312312', 'V1.256.895', 'V1256895', 'D', 'Almacen', '1', ''),
(5, 'SDFSDF', '1231 - 231.23.12', '12312312312', 'V27.913.620', 'V27913620', 'D', 'Almacen', '1', ''),
(6, 'Neifer Reveron', '0414 - 589.65.22', '04145896522', 'V-10.180.121', 'v10180121', 'Charallave', 'Almacen', '1', ''),
(7, 'asdasd', '1231 - 231.23.12', '12312312312', 'V-247.858.690', 'V247858690', 'dasdasdd', 'Almacen', '1', '1'),
(8, 'adsads', '1231 - 231.21.23', '12312312123', 'G-10180121-0', 'G101801210', 'asdasdads', 'Almacen', '1', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `code` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `brand` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `model` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `color` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `capacity` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `day_warranty` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de los equipos';

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id_equipo`, `code`, `brand`, `model`, `color`, `capacity`, `day_warranty`, `registered_by`, `last_modification`) VALUES
(1, '0102ALC2/32-N', 'Alcatel 1', '5033EP', 'Negro', '2/32GB', '15', 'NeiferJesus14', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `name_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `unformat_telephone_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `type_account` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de usuarios.';

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `name_user`, `username`, `password`, `telephone`, `unformat_telephone_user`, `direction`, `type_account`, `registered_by`, `last_modification`, `status`) VALUES
(1, 'Neifer Reverón', 'NeiferJesus14', '41DD3LQ4D6GVvOXW6vFX4A==', '0414 - 214.46.84', '04142144684', 'Almacen', 'Moderador', 'System', '12345', 'Activo'),
(2, 'Nery Ramos', 'Nery', 'U6tiCUDp7lU=', '0444 - 444.44.44', '04444444444', 'Almacen', 'Tecnico', 'NeiferJesus14', '', 'Activo'),
(3, 'Richard Miller', 'Richard', 'rIxyf/mbZq0=', '0414 - 477.78.85', '04144777885', 'City Market', 'Vendedor', 'NeiferJesus14', '', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `warranty`
--

CREATE TABLE `warranty` (
  `id_warranty` int(11) NOT NULL,
  `id_client` int(11) NOT NULL,
  `id_equipo` int(11) NOT NULL,
  `id_technical` int(11) NOT NULL,
  `id_registered_by` int(11) NOT NULL,
  `shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `serial` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `falla` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `date_register` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `received` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `date_sent_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_techincal` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `comments_technical` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_sent_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de las garantías...';

--
-- Volcado de datos para la tabla `warranty`
--

INSERT INTO `warranty` (`id_warranty`, `id_client`, `id_equipo`, `id_technical`, `id_registered_by`, `shop`, `serial`, `falla`, `date_register`, `received`, `date_sent_technical`, `delivery_technical`, `date_received_techincal`, `comments_technical`, `status`, `date_sent_shop`, `delivery_shop`, `date_received_shop`) VALUES
(1, 1, 1, 0, 1, '', '12345', 'Software', '07/05/2022', 'asdasdadasda', '', '', '', '', '', '', '', ''),
(2, 1, 1, 0, 1, '', 'ads', 'asd', '07/05/2022', '123123', '', '', '', '', '', '', '', ''),
(3, 0, 1, 0, 1, '', 'asd', '12312', '07/05/2022', 'adsd', '', '', '', '', '', '', '', ''),
(4, 0, 1, 0, 1, '', 'asdasda', 'asdasda', '07/05/2022', 'asda', '', '', '', '', '', '', '', ''),
(5, 0, 1, 0, 1, '', 'sdfsdfsd', 'asdasdasd', '07/05/2022', 'asdasdasd', '', '', '', '', 'Entregado', '', '', ''),
(6, 1, 1, 0, 1, '', 'asdasdada', 'asdasd', '07/05/2022', 'asda', '', '', '', '', 'Entregado', '', '', ''),
(7, 1, 1, 0, 1, 'Almacen', '12', '12', '07/05/2022', '12', '', '', '', '', 'Nuevo Ingreso', '', '', ''),
(8, 1, 1, 0, 1, 'Almacen', '9876543210', 'Táctil', '07/05/2022', 'ada', '', '', '', '', 'Nuevo Ingreso', '', '', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_client`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id_equipo`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indices de la tabla `warranty`
--
ALTER TABLE `warranty`
  ADD PRIMARY KEY (`id_warranty`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `warranty`
--
ALTER TABLE `warranty`
  MODIFY `id_warranty` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
