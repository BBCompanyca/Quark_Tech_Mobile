-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-07-2022 a las 18:31:31
-- Versión del servidor: 10.5.15-MariaDB-cll-lve
-- Versión de PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `u972055873_quarktech`
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
(1, 'Neifer Reveron', '0412 - 507.97.65', '04125079765', 'V-27.913.620', 'V27913620', 'Charallave', 'Almacen', '1', '');

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
(1, 'RED9A4/64-V', 'REDMI', '9A', 'VERDE', '4/64GB', '90', 'NeiferJesus14', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

CREATE TABLE `movimientos` (
  `id_movimiento` int(11) NOT NULL,
  `fecha` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `operation` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
(1, 'Neifer Reverón', 'NeiferJesus14', '41DD3LQ4D6GVvOXW6vFX4A==', '0424-149.10.41', '04241491041', 'Almacen', 'Moderador', '', '', 'Activo');

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
  `day_warranty` int(10) NOT NULL,
  `date_purchase` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_sent_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `comments_technical` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status_technical` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_sent_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `date_received_shop` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de las garantías...';

--
-- Volcado de datos para la tabla `warranty`
--

INSERT INTO `warranty` (`id_warranty`, `id_client`, `id_equipo`, `id_technical`, `id_registered_by`, `shop`, `serial`, `falla`, `date_register`, `received`, `day_warranty`, `date_purchase`, `date_sent_technical`, `delivery_technical`, `date_received_technical`, `comments_technical`, `status`, `status_technical`, `date_sent_shop`, `delivery_shop`, `date_received_shop`) VALUES
(1, 1, 1, 0, 1, 'Almacen', '12345', 'TACTIL Y SOFTWARE', '26/07/2022', 'CARGADOR Y AUDIFONOS.', 65, '01/07/2022', '', '', '', '', 'Nuevo Ingreso', '', '', '', '');

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
-- Indices de la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD PRIMARY KEY (`id_movimiento`);

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
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `movimientos`
--
ALTER TABLE `movimientos`
  MODIFY `id_movimiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `warranty`
--
ALTER TABLE `warranty`
  MODIFY `id_warranty` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
